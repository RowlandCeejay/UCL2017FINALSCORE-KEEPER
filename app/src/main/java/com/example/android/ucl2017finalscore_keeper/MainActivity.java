package com.example.android.ucl2017finalscore_keeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {
        int scoreTeamJuve=0;
        int redCardTeamJuve=0;
        int yellowCardTeamJuve=0;
        int scoreTeamMadrid=0;
        int redCardTeamMadrid=0;
        int yellowCardTeamMadrid=0;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /**
         *Increase the score for Team Juventus by adding one goal.
         */
        public void addOneGoalForJuve(View v){
            scoreTeamJuve=scoreTeamJuve+1;
            displayForTeamJuve(scoreTeamJuve);
        }

        /**
         *Increase the red card for Team Juventus by 1.
         */
        public void addOneRedCardForJuve(View v){
            redCardTeamJuve=redCardTeamJuve+1;
            setRedCardTeamJuve(redCardTeamJuve);
        }

        /**
         *Increase the yellow card for Team Juventus by 1.
         */
        public void addOneYellowCardForJuve(View v){
            yellowCardTeamJuve=yellowCardTeamJuve+1;
            setYellowCardTeamJuve(yellowCardTeamJuve);

        }


        /**
         *Increases the score for Team Madrid by 1 goal.
         */
        public void addOneGoalForMadrid(View v){
            scoreTeamMadrid=scoreTeamMadrid+1;
            displayForTeamMadrid(scoreTeamMadrid);
        }


        /**
         *Increases the red card for Team Madrid by 1.
         */
        public void addOneRedCardForMadrid(View v){
            redCardTeamMadrid=redCardTeamMadrid+1;
            setRedCardTeamMadrid (redCardTeamMadrid);
        }

        /**
         *Increases the yellow card for Team madrid by 1.
         */
        public void addOneYellowCardForMadrid(View v){
            yellowCardTeamMadrid=yellowCardTeamMadrid+1;
            setYellowCardTeamMadrid (yellowCardTeamMadrid);
        }

        /**
         *Resets the scores of the both teams to 0 point.
         */
        public void resetScore(View v){
            scoreTeamMadrid=0;
            scoreTeamJuve=0;
            yellowCardTeamMadrid=0;
            yellowCardTeamJuve=0;
            redCardTeamMadrid=0;
            redCardTeamJuve=0;
            displayForTeamMadrid(scoreTeamMadrid);
            setRedCardTeamMadrid(redCardTeamMadrid);
            setYellowCardTeamMadrid(yellowCardTeamMadrid);
            displayForTeamJuve(scoreTeamJuve);
            setRedCardTeamJuve(redCardTeamJuve);
            setYellowCardTeamJuve(yellowCardTeamJuve);
        }

        /**
         *Displays the given score for Team madrid.
         */
        public void displayForTeamMadrid(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_madrid_score);
            scoreView.setText(String.valueOf(score));
        }

        /**
         *Displays the given score for Team madrid.
         */
        public void setRedCardTeamMadrid(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_madrid_red_card);
            scoreView.setText(String.valueOf(score));
        }


        /**
         *Displays the given yellow card(s)forTeam madrid.
         */
        public void setYellowCardTeamMadrid(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_madrid_yellow_card);
            scoreView.setText(String.valueOf(score));
        }

        /**
         *Displays the given score for Team Juventus.
         */
        public void displayForTeamJuve(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_juve_score);
            scoreView.setText(String.valueOf(score));
        }

        /**
         *Displays the given score for Team Juventus.
         */
        public void setRedCardTeamJuve(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_juve_red_card);
            scoreView.setText(String.valueOf(score));
        }

        /**
         *Displays the given score for Team Juventus.
         */
        public void setYellowCardTeamJuve(int score){
            TextView scoreView=(TextView)findViewById(R.id.team_juve_yellow_card);
            scoreView.setText(String.valueOf(score));
        }


    }


