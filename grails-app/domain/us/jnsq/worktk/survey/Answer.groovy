package us.jnsq.worktk.survey

import us.jnsq.worktk.security.User

class Answer {
    Question question
    String answer
    User user

    static constraints = {
    }
}
