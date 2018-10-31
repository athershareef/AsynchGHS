public class Message {
    private int senderId;
    private int destinationId;
    private MessageType messageType;
    private int delay;

    public Message(int senderId, int destinationId, MessageType messageType, int delay) {
        this.senderId = senderId;
        this.destinationId = destinationId;
        this.messageType = messageType;
        this.delay = delay;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        return messageType +" from " + senderId +
                " to " + destinationId;
    }
}
