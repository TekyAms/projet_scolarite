package sn.esmt.scolarite;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeetudiantactivity);

        ListView listView = findViewById(R.id.list);

        String students[] = { "John Doe", "Jane Smith", "Bob Johnson", "Alice Williams", "Charlie Brown",
                "David Miller", "Emily Davis", "Frank Thomas", "Grace Wilson", "Henry Taylor",
                "Isabel White", "Jack Anderson", "Katherine Moore", "Leo Martinez", "Mia Thompson",
                "Nathan Harris", "Olivia Clark", "Patrick Lee", "Quinn Davis", "Rachel Turner",
                "Samuel Hall", "Sophia Brown", "Thomas Wilson", "Ursula Taylor", "Vincent Miller",
                "Wendy Anderson", "Xavier White", "Yvonne Davis", "Zachary Johnson", "Abigail Smith"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.listeetudiantactivity,
                R.id.textViewStudent,
                students
        );

        listView.setAdapter(adapter);
    }
}
