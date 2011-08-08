package us.jnsq.worktk.survey

import us.jnsq.worktk.security.User
import us.jnsq.worktk.project.Organization

class Survey {
    String title
    User owner
    Organization organization

    static constraints = {
    }
    
    static hasMany = [
        questionGroups: QuestionGroup,
        questions: Question
    ]
}
