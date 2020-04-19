package com.cloud.loadBalancer.controllers;

import com.cloud.loadBalancer.dto.StudentDto;
import com.cloud.loadBalancer.dto.Value;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {
    static int count = 1;
    String value = "Men in black";

    @GetMapping("/detail")
    public StudentDto studentDetails(@RequestParam(value = "name") String name) throws OutOfMemoryError, InterruptedException {

            System.out.println(count);
            count++;
            Thread.sleep(1000);

        return new StudentDto(name, 21);
    }


    @GetMapping("/setValue")
    public void setValue(@RequestParam(value = "value") String value) throws OutOfMemoryError {
        this.value = value;

    }

    @GetMapping("/setValueWithException")
    public void setValueWithException(@RequestParam(value = "value") String value) throws OutOfMemoryError {
        throw new OutOfMemoryError();

    }

    @GetMapping("/getValue")
    public Value getValue() {
        return new Value(this.value);

    }

    @PostMapping("/store")
    public StudentDto studentDetails(@RequestBody StudentDto studentInfoDto) {

        return new StudentDto(studentInfoDto.getName(), studentInfoDto.getAge());
    }
}