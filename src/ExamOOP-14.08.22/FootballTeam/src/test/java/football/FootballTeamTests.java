package football;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTeamTests {

    private static final String FOOTBALLER_NAME = "Ivan";
    private static final String FOOTBALL_TEAM_NAME = "Juventus";

    private FootballTeam team;
    private Footballer footballer;

    @Before
    public void setUp() {
        this.team = new FootballTeam(FOOTBALL_TEAM_NAME, 1);
        this.footballer = new Footballer(FOOTBALLER_NAME);
    }

    @Test
    public void test_FootballTeam_Return_Name() {
        assertEquals(FOOTBALL_TEAM_NAME, team.getName());
    }

    @Test
    public void test_Return_VacantPosition() {
        assertEquals(1, team.getVacantPositions());
    }

    @Test(expected = NullPointerException.class)
    public void test_SetName_Throws_Exception() {
        FootballTeam team = new FootballTeam(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_SetVacantPosition_Throws_Exception() {
        FootballTeam team = new FootballTeam("Barcelona", -1);
    }

    @Test
    public void test_GetCount_Return_ZeroOrOne() {
        assertEquals(0, team.getCount());
        team.addFootballer(footballer);
        assertEquals(1, team.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Throw_Exception_When_Adding_Footballer_AtMaxCapacity() {
        team.addFootballer(footballer);
        team.addFootballer(footballer);
    }

    @Test
    public void test_AddingFootballer() {
        team.addFootballer(footballer);
    }

    @Test()
    public void test_Remove_FootBaller() {
        team.addFootballer(footballer);
        team.removeFootballer(FOOTBALLER_NAME);
        assertEquals(0, team.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Throws_WhenRemoving_FootBaller_Who_Is_NotInTheTEam() {
        team.addFootballer(footballer);
        team.removeFootballer("Petko");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_NoSuch_FootBaller_Throws() {
        team.addFootballer(new Footballer("Petko"));
        team.addFootballer(new Footballer("Dido"));
        team.footballerForSale("Jvan ot Ivandy");
    }

    @Test
    public void test_SoldFootBaller() {
        team.addFootballer(footballer);
        Footballer footballer = team.footballerForSale(FOOTBALLER_NAME);
        assertEquals(footballer.getName(), "Ivan");
        assertFalse(footballer.isActive());
    }

    @Test
    public void test_getStatistics() {
        team.addFootballer(footballer);
        assertEquals(team.getStatistics(), "The footballer Ivan is in the team Juventus.");
    }
}
