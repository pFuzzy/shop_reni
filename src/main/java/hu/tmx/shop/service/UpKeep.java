package hu.tmx.shop.service;

public class UpKeep
{
    private boolean isRequired = false;
    private String event;

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String giveEventName() throws Exception {
        if(isRequired) {
            return getEvent();
        }
        else {
            throw new Exception("Nincs karbantartási eseménye ennek a terméknek: " + getClass());
        }
    }
}
