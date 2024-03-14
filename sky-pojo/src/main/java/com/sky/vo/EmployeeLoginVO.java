package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "员工登录返回的数据格式")
/**
 * 这段代码是Java语言写的，用于定义一个名为`EmployeeLoginVO`的类，它实现了`Serializable`接口，这意味着这个类的对象可以被序列化，即可以转换为字节流，从而可以在网络上传输或存储到文件中。
 *
 * 这个类使用了几个注解来增强其功能和可读性：
 *
 * - `@Data`: 这是一个Lombok库提供的注解，它为类自动生成了所有属性的getter和setter方法，以及`equals()`, `canEqual()`, `hashCode()`, `toString()`方法。
 * - `@Builder`: 这也是Lombok的注解，它提供了一种建造者模式的实现。这允许你通过链式调用方法来构建`EmployeeLoginVO`对象。
 * - `@NoArgsConstructor`: 这个注解生成一个无参的构造函数。
 * - `@AllArgsConstructor`: 这个注解生成一个包含所有属性作为参数的构造函数。
 * - `@ApiModel(description = "员工登录返回的数据格式")`: 这是Swagger库的注解，用于描述模型的信息，这里指定了模型的描述。
 * - `@ApiModelProperty`: 这也是Swagger的注解，用于描述属性的信息，如主键值、用户名、姓名和jwt令牌。
 *
 * 每个属性前的`@ApiModelProperty`注解都包含了一个描述，这有助于理解每个属性的用途。例如，`id`是主键值，`userName`是用户名，`name`是姓名，`token`是jwt令牌，jwt令牌通常用于身份验证和信息交换。
 *
 * 总的来说，这个类是用于员工登录后返回相关信息的数据传输对象（DTO）。它通过使用Lombok和Swagger注解，简化了代码的编写，并提供了清晰的API文档。这样的设计使得代码更加简洁，易于维护和使用。
 */
public class EmployeeLoginVO implements Serializable {

    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

}
