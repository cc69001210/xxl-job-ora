package com.xxl.job.core.param.entity;

import java.io.Serializable;

/**
 * @company: 北京一零科技
 * @program: xxl-job
 * @author: cc
 * @Date: 2020-12-11 09:05
 * @Description: Executor 执行器的参数传递。
 */
public class ExecutorParams implements Serializable {


    private String executorParams;

    private long logId;


    public String getExecutorParams() {
        return executorParams;
    }

    public void setExecutorParams(String executorParams) {
        this.executorParams = executorParams;
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }
}
