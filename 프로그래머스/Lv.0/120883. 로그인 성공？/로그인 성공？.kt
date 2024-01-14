class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer = "fail"
        
        db.forEach { 
            when {
                it[0] == id_pw[0] && it[1] == id_pw[1] -> return "login"
                it[0] == id_pw[0] && it[1] != id_pw[1] -> answer = "wrong pw"
            }
        }
        
        return answer
    }
}