package com.example.android.careconnectvolunteer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class CareConnectVolunteer extends AppCompatActivity {
    private EditText mNameEditText;
    private CheckBox mQ11CheckBox;
    private CheckBox mQ12CheckBox;
    private CheckBox mQ13CheckBox;
    private CheckBox mQ14CheckBox;
    private CheckBox mQ15CheckBox;
    private CheckBox mQ16CheckBox;
    private CheckBox mQ17CheckBox;
    private CheckBox mQ18CheckBox;
    private CheckBox mQ19CheckBox;
    private CheckBox mQ21CheckBox;
    private CheckBox mQ22CheckBox;
    private CheckBox mQ23CheckBox;
    private CheckBox mQ24CheckBox;
    private CheckBox mQ25CheckBox;
    private CheckBox mQ32CheckBox;
    private CheckBox mQ41CheckBox;
    private CheckBox mQ42CheckBox;
    private CheckBox mQ43CheckBox;
    private CheckBox mQ44CheckBox;
    private CheckBox mQ45CheckBox;
    private CheckBox mQ46CheckBox;
    private CheckBox mQ47CheckBox;
    private RadioButton mQ51RadioButton;
    private EditText mQ6EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_connect_volunteer);
        mNameEditText = (EditText) findViewById(R.id.name);
        mQ11CheckBox = (CheckBox) findViewById(R.id.q11);
        mQ12CheckBox = (CheckBox) findViewById(R.id.q12);
        mQ13CheckBox = (CheckBox) findViewById(R.id.q13);
        mQ14CheckBox = (CheckBox) findViewById(R.id.q14);
        mQ15CheckBox = (CheckBox) findViewById(R.id.q15);
        mQ16CheckBox = (CheckBox) findViewById(R.id.q16);
        mQ17CheckBox = (CheckBox) findViewById(R.id.q17);
        mQ18CheckBox = (CheckBox) findViewById(R.id.q18);
        mQ19CheckBox = (CheckBox) findViewById(R.id.q19);
        mQ21CheckBox = (CheckBox) findViewById(R.id.q21);
        mQ22CheckBox = (CheckBox) findViewById(R.id.q22);
        mQ23CheckBox = (CheckBox) findViewById(R.id.q23);
        mQ24CheckBox = (CheckBox) findViewById(R.id.q24);
        mQ25CheckBox = (CheckBox) findViewById(R.id.q25);
        mQ32CheckBox = (CheckBox) findViewById(R.id.q32);
        mQ41CheckBox = (CheckBox) findViewById(R.id.q41);
        mQ42CheckBox = (CheckBox) findViewById(R.id.q42);
        mQ43CheckBox = (CheckBox) findViewById(R.id.q43);
        mQ44CheckBox = (CheckBox) findViewById(R.id.q44);
        mQ45CheckBox = (CheckBox) findViewById(R.id.q45);
        mQ46CheckBox = (CheckBox) findViewById(R.id.q46);
        mQ47CheckBox = (CheckBox) findViewById(R.id.q47);
        mQ51RadioButton = (RadioButton) findViewById(R.id.q51);
        mQ6EditText = (EditText)findViewById(R.id.q6);
    }
    /**
     * This method is called when the submit button is clicked.
     */
    public void submitScore(View view) {
        String name = mNameEditText.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(this, "Please don`t forget to enter your name", Toast.LENGTH_SHORT).show();
            return;
        }
        int score = 0;
        // Evaluate Question 1 answers.
        if (mQ11CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ12CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ13CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ14CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ15CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ16CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ17CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ18CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ19CheckBox.isChecked()) {
            score += 1;
        }
        // Evaluate Question 2 answers.
        if (mQ22CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ23CheckBox.isChecked()) {
            score += 1;
        }
        // Evaluate Question 3 answers.
        if (mQ32CheckBox.isChecked()) {
            score += 1;
        }
        // Evaluate Question 4 answers.
        if (mQ41CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ42CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ43CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ44CheckBox.isChecked()) {
            score += 1;
        }if (mQ45CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ46CheckBox.isChecked()) {
            score += 1;
        }
        if (mQ47CheckBox.isChecked()) {
            score += 1;
        }
        // Evaluate Question 5 answers.
        if (mQ51RadioButton.isChecked()) {
            score += 1;
        }
        // Evaluate Question 6 answers.
        String volunteerHoursPerWeek = mQ6EditText.getText().toString();
        if (  !volunteerHoursPerWeek.isEmpty() && !volunteerHoursPerWeek.equals("0")) {
            score += 1;
        }
           // Final Evaluation

        if (score < 2 ) {

            Toast.makeText(this, "Your score is 1/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }

            if (score < 3 ) {

                Toast.makeText(this, "Your score is 2/21. Better luck next time!", Toast.LENGTH_LONG).show();
            }

        if (score < 4 ) {

            Toast.makeText(this, "Your score is 3/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }

        if (score < 5 ) {

            Toast.makeText(this, "Your score is 4/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }
        if (score < 6 ) {

            Toast.makeText(this, "Your score is 5/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }
        if (score < 7 ) {

            Toast.makeText(this, "Your score is 6/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }
        if (score < 8 ) {

            Toast.makeText(this, "Your score is 7/21. Better luck next time!", Toast.LENGTH_LONG).show();
        }
        if (score < 9 ) {

            Toast.makeText(this, "Your score is 8/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 10 ) {

            Toast.makeText(this, "Your score is 9/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 11 ) {

            Toast.makeText(this, "Your score is 10/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 12 ) {

            Toast.makeText(this, "Your score is 11/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 13 ) {

            Toast.makeText(this, "Your score is 12/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 14 ) {

            Toast.makeText(this, "Your score is 13/21. Nice job!", Toast.LENGTH_LONG).show();
        }
        if (score < 15 ) {

            Toast.makeText(this, "Your score is 14/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 16 ) {

            Toast.makeText(this, "Your score is 15/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 17 ) {

            Toast.makeText(this, "Your score is 16/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 18 ) {

            Toast.makeText(this, "Your score is 17/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 19 ) {

            Toast.makeText(this, "Your score is 18/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 20 ) {

            Toast.makeText(this, "Your score is 19/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 21 ) {

            Toast.makeText(this, "Your score is 20/21. Excellent!", Toast.LENGTH_LONG).show();
        }
        if (score < 22) {

            Toast.makeText(this, "Your score is 21/21. Wohoow! 100% Excellent!", Toast.LENGTH_LONG).show();
        }
}}
