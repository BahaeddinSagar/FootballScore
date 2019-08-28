package ly.bsagar.footbalscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView team1Goals;
    TextView team2Goals;
    TextView team1Yellow;
    TextView team2Yellow;
    TextView team1Red;
    TextView team2Red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1Goals = findViewById(R.id.Team1Goals);
        team2Goals = findViewById(R.id.Team2Goals);
        team1Yellow = findViewById(R.id.Team1Yellow);
        team2Yellow = findViewById(R.id.Team2Yellow);
        team1Red = findViewById(R.id.Team1Red);
        team2Red = findViewById(R.id.Team2Red);
    }

    public void reset(View view) {
        int goals_1 = Integer.parseInt(team1Goals.getText().toString());
        int goals_2 = Integer.parseInt(team2Goals.getText().toString());
        if (goals_1 > goals_2) {
            Toast.makeText(this, "Game Over, Team 1 wins", Toast.LENGTH_LONG).show();
        } else if (goals_2>goals_1){
            Toast.makeText(this, "Game Over, Team 2 wins", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Game Over, it's a draw", Toast.LENGTH_LONG).show();
        }
        team1Goals.setText("0");
        team2Goals.setText("0");
        team1Yellow.setText("0");
        team2Yellow.setText("0");
        team1Red.setText("0");
        team2Red.setText("0");

    }

    public void team1GoadAdd(View view) {
        int goals1 = Integer.parseInt(team1Goals.getText().toString());
        goals1++;
        team1Goals.setText(""+goals1);

    }

    public void team1GoadRemove(View view) {
        int goals1 = Integer.parseInt(team1Goals.getText().toString());
        if (goals1  == 0){
            return;
        }
        goals1--;
        team1Goals.setText(""+goals1);
    }

    public void team2GoadAdd(View view) {
        int goals2 = Integer.parseInt(team2Goals.getText().toString());
        goals2++;
        team2Goals.setText(""+goals2);
    }

    public void team2GoadRemove(View view) {
        int goals2 = Integer.parseInt(team2Goals.getText().toString());
        if (goals2  == 0){
            return;
        }
        goals2--;
        team2Goals.setText(""+goals2);
    }

    public void team1YellAdd(View view) {
        int yellow1 = Integer.parseInt(team1Yellow.getText().toString());
        yellow1++;
        team1Yellow.setText(""+yellow1);
    }

    public void team1YellRemove(View view) {
        int yellow1 = Integer.parseInt(team1Yellow.getText().toString());
        if (yellow1  == 0){
            return;
        }
        yellow1--;
        team1Yellow.setText(""+yellow1);
    }

    public void team2YellAdd(View view) {
        int yellow2 = Integer.parseInt(team2Yellow.getText().toString());

        yellow2++;
        team2Yellow.setText(""+yellow2);
    }

    public void team2YellRemove(View view) {
        int yellow2 = Integer.parseInt(team2Yellow.getText().toString());
        if (yellow2  == 0){
            return;
        }
        yellow2--;
        team2Yellow.setText(""+yellow2);
    }

    public void team1RedAdd(View view) {
        int red1 = Integer.parseInt(team1Red.getText().toString());
        red1++;
        team1Red.setText(""+red1);
    }

    public void team1RedRemove(View view) {

        int red1 = Integer.parseInt(team1Red.getText().toString());
        if (red1  == 0){
            return;
        }
        red1--;
        team1Red.setText(""+red1);
    }

    public void team2RedAdd(View view) {
        int red2 = Integer.parseInt(team2Red.getText().toString());
        red2++;
        team2Red.setText(""+red2);
    }

    public void team2RedRemove(View view) {

        int red2 = Integer.parseInt(team2Red.getText().toString());
        if (red2  == 0){
            return;
        }
        red2--;
        team2Red.setText(""+red2);
    }
}
