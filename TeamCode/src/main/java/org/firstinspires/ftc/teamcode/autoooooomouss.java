package org.firstinspires.ftc.teamcode;

import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.pedropathing.util.Timer;

@Autonomous
public class autoooooomouss extends OpMode {

    private Follower follower;
    private Timer pathTimer, opModeTimer;

    public enum PathState {
        DRIVE_STARTPOS_PICK_POS.x
        SHOOT_PRELOAD
    }
    PathState pathState;

    private final Pose startpose = new Pose(x: 40.27364185110664, y: 8.692152917505023, Math.toRadians(0))
    @Override
    public void init() {

    }

    @Override
    public void loop (){

    }
}