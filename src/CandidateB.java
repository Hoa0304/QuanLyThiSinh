public class CandidateB extends Candidate{
    public static final String MON_TOAN = "Toan";
    public static final String MON_SINH = "Sinh";
    public static final String MON_HOA = "Hoa";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
