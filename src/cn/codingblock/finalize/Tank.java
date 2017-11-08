package cn.codingblock.finalize;

import cn.codingblock.utils.log.Logger;

/**
 * 编写Tank类，此类状态可以是满或空。
 * 终结条件：对象呗清理时必须处于空状态。
 */
public class Tank {
    private boolean isEmpty;

    public Tank() {
        this.isEmpty= true;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    protected void finalize() throws Throwable {
        Logger.println("finalize:" + this);
        if (isEmpty) {
            Logger.println("Error, " + this + " is empty!");
            return;
        }
        super.finalize();
    }
}
