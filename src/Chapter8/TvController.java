package Chapter8;

public class TvController implements PowerController{

    TvState mState = null;

    private void setTvState(TvState state) {
        this.mState = state;
    }


    @Override
    public void powerOn() {
        if (mState == null || mState instanceof PowerOffState) {
            setTvState(new PowerOnState());
            System.out.println("开机啦");
        }
    }

    @Override
    public void powerOff() {
        if (mState == null || mState instanceof PowerOnState) {
            setTvState(new PowerOffState());
            System.out.println("关机啦");
        }

    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void turnUp() {
        mState.turnUp();
    }

    public void turnDown() {
        mState.turnDown();
    }
}
