public class CandidateC extends Candidate{
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public CandidateC(String id, String name, String address, int priority) {
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
