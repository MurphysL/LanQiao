package ChineseCharacterEquation;

/**
 *   祥瑞生辉
 * + 三羊献瑞
 * -----------
 *  三羊生瑞气
 * 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字，
 * ‘三’和‘祥’不能为 0。请你计算出“三羊献瑞”所代表的 4 位数是什么。（答案唯一）
 */
public class Main {

    public static void main(String[] args){

        boolean[] isUse = {false , false ,false ,false ,false ,false ,false ,false ,false ,false};

        for(int x = 1 ; x <= 9 ; x ++){
            isUse[x] = true;
            for(int r = 0 ;r <= 9 ; r ++){
                if(!isUse[r]){
                    isUse[r] = true;
                    for(int s = 0 ;s <= 9 ; s ++){
                        if(!isUse[s]){
                            isUse[s] = true;
                            for(int h = 0 ;h <= 9 ; h ++){
                                if(!isUse[h]){
                                    isUse[h] = true;
                                    for(int san = 1 ;san <= 9 ; san ++){
                                        if(!isUse[san]){
                                            isUse[san] = true;
                                            for(int y = 0 ;y <= 9 ; y ++){
                                                if(!isUse[y]){
                                                    isUse[y] = true;
                                                    for(int xian = 0 ;xian <= 9 ; xian ++){
                                                        if(!isUse[xian]){
                                                            isUse[xian] = true;
                                                            for(int q = 0 ;q <= 9 ; q ++){
                                                                if(!isUse[q]){
                                                                    if(x*1000 + r*100 + s*10 + h + san*1000 + y*100 + xian*10 + r == san*10000 + y*1000 + s*100 + r*10 + q){
                                                                        System.out.println(san*1000 + y*100 + xian*10 + r);
                                                                    }
                                                                }
                                                            }
                                                            isUse[xian] = false;
                                                        }
                                                    }
                                                    isUse[y] = false;
                                                }
                                            }
                                            isUse[san] = false;
                                        }
                                    }
                                    isUse[h] = false;
                                }
                            }
                            isUse[s] = false;
                        }
                    }
                    isUse[r] = false;
                }
            }
            isUse[x] = false;
        }
    }

}
