package com.reading.Connect;

import com.reading.databaseSql.staticSqlUser;
import com.reading.entity.codeUser;
import com.reading.util.openDabases;
import com.reading.util.reStruct;
import com.reading.util.returnNetwork;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CompleteController {

@RequestMapping("/text")
public returnNetwork Text(){
    return new returnNetwork<>(new reStruct().ReJsonSuccess(new ArrayList<String>(
           List.of("欢迎使用此类系统",
                   "12332342"
           ))));
}

@RequestMapping("/user")
public returnNetwork user(@RequestBody codeUser data){

    openDabases openDabases = new openDabases();
    openDabases.insertData(new staticSqlUser().getCreateSql(), Integer.parseInt(data.getName()),data);
    return new returnNetwork<>(new reStruct().Success());
}
}
