/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.Serializable;

/**
 *
 * @author naimi
 */
public class Feedback implements Serializable {
    private String feedbackhubfield ;

    public Feedback(String feedbackhubfield) {
        this.feedbackhubfield = feedbackhubfield;
    }

    public String getFeedbackhubfield() {
        return feedbackhubfield;
    }

    public void setFeedbackhubfield(String feedbackhubfield) {
        this.feedbackhubfield = feedbackhubfield;
    }

    @Override
    public String toString() {
        return "Feedback{" + "feedbackhubfield=" + feedbackhubfield + '}';
    }
    
}
