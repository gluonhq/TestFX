package org.testfx.framework.junit5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation for marking isolated test classes
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Can be used on classes
public @interface IsolateContext {
}
