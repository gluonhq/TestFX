/*
 * Copyright 2013-2014 SmartBear Software
 * Copyright 2014-2024 The TestFX Contributors
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the
 * European Commission - subsequent versions of the EUPL (the "Licence"); You may
 * not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the Licence for the
 * specific language governing permissions and limitations under the Licence.
 */
package org.testfx.toolkit.impl;

import java.lang.reflect.Field;
import javafx.application.Application;

import org.testfx.toolkit.ApplicationLauncher;

public class ApplicationLauncherImpl implements ApplicationLauncher {

    @Override
    public void launch(Class<? extends Application> appClass, String... appArgs) {
        initHeadless();
        Application.launch(appClass, appArgs);
    }

    private void initHeadless() {
        if (Boolean.getBoolean("testfx.headless")) {
            if (Boolean.getBoolean("testfx.verbose")) {
                System.out.println("testfx: headless mode requested");
            }
            try {
                assignHeadlessPlatform();
            }
            catch (ClassNotFoundException exception) {
                throw new IllegalStateException("headless platform not found", exception);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }

    private void assignHeadlessPlatform() throws Exception {
        Class<?> platformFactoryClass = Class.forName("com.sun.glass.ui.PlatformFactory");
        Object platformFactoryImpl = Class.forName("com.sun.glass.ui.headless.HeadlessPlatformFactory")
                .getDeclaredConstructor().newInstance();
        assignPrivateStaticField(platformFactoryClass, "instance", platformFactoryImpl);
    }

    private void assignPrivateStaticField(Class<?> clazz, String name, Object value) throws Exception {
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        field.set(clazz, value);
        field.setAccessible(false);
    }

}
