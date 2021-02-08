package com.springboot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 16:05 2021/2/8
 * @Modified By:
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;
}
