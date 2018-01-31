import java.util.ArrayList;

//Jacob Johnson
public class Roster extends Player{
	private String roster;
	private String teamName;
	private ArrayList<Player> teamList;
	
	public Roster(String tn, int number, String name, String position) {
		super(number, name, position);
		setTeamName(tn);
		teamList = new ArrayList<Player>();
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public ArrayList<Player> getTeamList() {
		return teamList;
	}

	public void setTeamList(ArrayList<Player> teamList) {
		this.teamList = teamList;
	}
	
	public void addToTeam(Player p) {
		teamList.add(p);
		this.roster += p.toString();
		
	}
	
	public String displayRoster() {
		return roster;
		
	}
	

}
