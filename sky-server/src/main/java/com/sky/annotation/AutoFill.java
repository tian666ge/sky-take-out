package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author tianYou
 * @version 1 .0
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 * 这段Java代码定义了一个名为`AutoFill`的注解（Annotation），用于修饰方法。注解是Java 5引入的一个特性，它提供了一种原数据(metadata)的形式，使得我们可以在代码中添加信息，这些信息可以在编译时、类加载时，以及运行时被读取，并执行相应的处理。以下是对这个注解定义各部分的详细解释：
 *
 * ### `@Target(ElementType.METHOD)`
 *
 * - `@Target`指定了该注解可以应用的Java元素类型。
 * - `ElementType.METHOD`表示这个注解只能被用来修饰方法。
 *
 * ### `@Retention(RetentionPolicy.RUNTIME)`
 *
 * - `@Retention`指定了注解的保留策略，即这个注解的信息需要保留到什么阶段。
 * - `RetentionPolicy.RUNTIME`表示这个注解的信息在运行时仍然保留，因此可以通过反射机制读取这个注解的信息。这对于运行时动态处理注解信息非常重要。
 *
 * ### `public @interface AutoFill`
 *
 * - 这行定义了一个注解类型（`@interface`），名称为`AutoFill`。注解类型的定义方式与接口相似，但前面加了`@`符号。
 * - 注解定义体中可以声明方法。在注解中，这些方法实际上定义了该注解的属性。
 *
 * ### `OperationType value();`
 *
 * - 这个注解定义了一个属性`value`，其类型为`OperationType`（这应该是一个枚举类型，但没有在代码段中给出定义）。枚举`OperationType`需要在别处定义，它可能包含一系列的操作类型。
 * - 使用这个注解时，必须提供一个`OperationType`类型的值来指定某种操作类型。例如：`@AutoFill(OperationType.SOME_OPERATION)`。
 * - 在注解中，如果只有一个属性需要被设置，且属性的名称是`value`，那么在使用注解时可以直接提供值，不需要写出属性名。
 *
 * ### 使用场景
 *
 * 假设`OperationType`枚举定义了不同的操作类型，`AutoFill`注解可能被用来标注在方法上，指示这个方法在运行时需要执行某种特定的自动填充操作。由于注解保留到运行时，可以通过反射获取到方法上的`AutoFill`注解及其`value`属性的值，进而根据这个值执行相应的逻辑。
 *
 * 例如，在一个Web框架中，可能会根据`AutoFill`注解自动从请求中提取数据并填充到方法的参数中，或者在业务逻辑处理前自动完成一些准备工作。
 *
 * 这种方式使得开发者可以通过简单的注解来声明性地请求框架提供某种服务，从而减少模板代码的编写，使得代码更加简洁和易于理解。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value();
}
