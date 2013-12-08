package me.libraryaddict.disguise.disguisetypes.watchers;

import me.libraryaddict.disguise.disguisetypes.Disguise;

public class CreeperWatcher extends LivingWatcher {

    public CreeperWatcher(Disguise disguise) {
        super(disguise);
    }

    @Deprecated
    public boolean isFused() {
        return (Byte) getValue(16, (byte) 0) == 1;
    }

    public boolean isIgnited() {
        return (Byte) getValue(18, (byte) 0) == 1;
    }

    public boolean isPowered() {
        return (Byte) getValue(17, (byte) 0) == 1;
    }

    @Deprecated
    public void setFuse(boolean isFused) {
        setValue(16, (byte) (isFused ? 1 : -1));
        sendData(16);
    }

    @Deprecated
    public void setFused(boolean isFused) {
        setValue(16, (byte) (isFused ? 1 : -1));
        sendData(16);
    }

    public void setIgnited(boolean ignited) {
        setValue(18, (byte) (ignited ? 1 : 0));
        sendData(18);
    }

    public void setPowered(boolean powered) {
        setValue(17, (byte) (powered ? 1 : 0));
        sendData(17);
    }

}
