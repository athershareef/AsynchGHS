public enum MessageType {
    INITIATE // Broadcast through the component, starting at the leader, to trigger to find MWOE
    , REPORT // Converge-cast the info about MWOE
    , TEST // find the mwoe for the process
    , ACCEPT, REJECT // Response to Test message for component (same, different)
    , CHANGE_ROOT //
    , CONNECT //
    , DONE
}
