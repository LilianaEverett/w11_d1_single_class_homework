public class Printer {

    private int paperLeft;
    private int printedDocs;
    private int toner;

    public Printer(int paperLeft, int toner){
        this.paperLeft = paperLeft;
        this.printedDocs = 0;
        this.toner = toner;
    }

    public int getPaperLeft(){
        return this.paperLeft;
    }

    public int getPrintedDocs(){
        return this.printedDocs;
    }

    public int getToner(){
        return this.toner;
    }

    public boolean enoughPaper(int numCopies, int numDocs){
        if (paperLeft >= numCopies * numDocs){
            return true;
        } else {
            return false;
        }
    }

    public void print(int numCopies, int numDocs){
        if (enoughPaper(numCopies, numDocs) == true){
            this.printedDocs = numCopies * numDocs;
            this.paperLeft -= printedDocs;
            this.toner -= numCopies * numDocs;
        } else {

        }
    }
}
