package 프로그래머스;

public class 신규아이디추천 {
    public String solution(String new_id) {
        신규아이디추천 ic = new 신규아이디추천();
        Recommended rc = ic.new Recommended(new_id);

        String answer = rc.lowerCase()
                .rmSpecial()
                .rmTwoDotsInRow()
                .rmDotInSAE()
                .isEmpty()
                .isLongerThanSixt()
                .isEndWithDot()
                .isLenUnderTwo()
                .getId();

        return answer;
    }

    class Recommended{
        String id;
        public String getId() {
            return id;
        }
        Recommended(String id){
            this.id = id;
        }
        public Recommended lowerCase() {
            return new Recommended(id.toLowerCase());
        }

        //소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를
        public Recommended rmSpecial() {
            return new Recommended(id.replaceAll("[^a-z0-9-_.]", ""));
        }
        //연속된 . 제거
        public Recommended rmTwoDotsInRow() {
            return new Recommended(id.replaceAll("[.]{2,}", "."));
        }
        //시작과 끝 . 제거
        public Recommended rmDotInSAE() {
            return new Recommended(id.replaceAll("^[.]|[.]$", ""));
        }
        //new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다
        public Recommended isEmpty() {
            return new Recommended(id.isEmpty() ? "a" : id);
        }
        //new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        public Recommended isLongerThanSixt() {
            if(id.length() >= 16 ) {
                return new Recommended(id.substring(0,15));
            }
            return this;
        }
        public Recommended isEndWithDot() {
            if(id.charAt(id.length()-1) == '.') {
                return new Recommended(id.substring(0, id.length()-1));
            }
            return this;
        }

        //new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        public Recommended isLenUnderTwo() {
            String lastStr = String.valueOf(id.charAt(id.length()-1));
            StringBuffer sb = new StringBuffer(id);
            if(id.length() <= 2) {
                while(sb.toString().length() < 3) {
                    sb.append(lastStr);
                }
                return new Recommended(sb.toString());
            }

            return this;
        }
    }
}
