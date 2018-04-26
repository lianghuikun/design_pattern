package com.example.chain;

// 主任类
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("员工：" + request.getEmpName() +
                    ", 请假天数:" + request.getLeaveDays() +
                    ",理由：" + request.getReason() + "");
            System.out.println("主任:" + this.name + "审批通过");
        } else {
            if (this.nextLeader != null) {
                // 大于3天交给下家来处理
                // 至于下家是谁，在构建时，可以传递进来
                nextLeader.handleRequest(request);
            }
        }
    }
}
