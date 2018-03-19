package com.example;

import org.iowacityrobotics.roboed.robot.IRobotProgram;
import org.iowacityrobotics.roboed.robot.RobotMode;
import org.iowacityrobotics.roboed.util.logging.Logs;

public class Robot implements IRobotProgram {

    @Override
    public void init() {
        RobotMode.TELEOP.setOperation(() -> {
			Logs.info("Hello, world!");
		});
    }

}
