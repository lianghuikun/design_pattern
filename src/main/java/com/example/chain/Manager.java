package com.example.chain;

// 经理类
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() >= 3 && request.getLeaveDays() < 10) {
            System.out.println("员工：" + request.getEmpName() +
                    ", 请假天数:" + request.getLeaveDays() +
                    ",理由：" + request.getReason() + "");
            System.out.println("经理:" + this.name + "审批通过");
        } else {
            if (this.nextLeader != null) {
                // 大于10天，交给总经理审批
                nextLeader.handleRequest(request);
            }
        }
    }
}
