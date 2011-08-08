package us.jnsq.worktk.survey

class Question {
    Integer questionNumber
    String question
    Survey survey
    QuestionGroup group

    static constraints = {
    }
    
    static hasMany = [
        options: Option
    ]
}
