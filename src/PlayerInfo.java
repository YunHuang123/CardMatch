public class PlayerInfo {
    private String name;
    private int attemptRecord;
    private int timeRecord;

    public PlayerInfo(String pName, int aRecord, int tRecord){
        name = pName;
        attemptRecord = aRecord;
        timeRecord = tRecord;
    }

    public String getName() {
        return name;
    }

    public int getAttemptRecord() {
        return attemptRecord;
    }

    public int getTimeRecord() {
        return timeRecord;
    }
}
