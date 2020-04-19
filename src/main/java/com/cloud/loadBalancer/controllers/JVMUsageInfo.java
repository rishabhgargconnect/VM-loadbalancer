package com.cloud.loadBalancer.controllers;

import com.sun.management.OperatingSystemMXBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
@RequestMapping("/api/jvm")
public class JVMUsageInfo {

    OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
            OperatingSystemMXBean.class);

    // What % CPU load this current JVM is taking, from 0.0-1.0

    @GetMapping("/cpu-and-system-load")
    public String getLoad() {
//        System.out.println(osBean.getProcessCpuLoad());
//
//// What % load the overall system is at, from 0.0-1.0
//        System.out.println(osBean.getSystemCpuLoad());

        return osBean.getProcessCpuLoad() + "  &  " + osBean.getSystemCpuLoad();
    }
}
