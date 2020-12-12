package com.xxl.job.admin.core.model.dto;

import java.io.Serializable;

/**
 * @company: 北京一零科技
 * @program: xxl-job
 * @author: cc
 * @Date: 2020-12-01 14:05
 * @Description: 新增 Bean，用于接收统计数量（原始的是大写，map无法获取）
 */
public class XxlJobLogReportDto implements Serializable {

    private Integer triggerDayCount;            // 总计数量
    private Integer triggerDayCountRunning;     // 正在执行数量
    private Integer triggerDayCountSuc;         // 成功数量

    public Integer getTriggerDayCount() {
        return triggerDayCount;
    }

    public void setTriggerDayCount(Integer triggerDayCount) {
        this.triggerDayCount = triggerDayCount;
    }

    public Integer getTriggerDayCountRunning() {
        return triggerDayCountRunning;
    }

    public void setTriggerDayCountRunning(Integer triggerDayCountRunning) {
        this.triggerDayCountRunning = triggerDayCountRunning;
    }

    public Integer getTriggerDayCountSuc() {
        return triggerDayCountSuc;
    }

    public void setTriggerDayCountSuc(Integer triggerDayCountSuc) {
        this.triggerDayCountSuc = triggerDayCountSuc;
    }
}
