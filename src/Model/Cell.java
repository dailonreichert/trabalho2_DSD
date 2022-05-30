package Model;

import java.util.ArrayList;

/**
 *
 * @author Barth_Reichert
 */
public abstract class Cell {

//    1 Estrada Cima
//    2 Estrada Direita
//    3 Estrada Baixo
//    4 Estrada Esquerda
//    5 Cruzamento Cima
//    6 Cruzamento Direita
//    7 Cruzamento Baixo
//    8 Cruzamento Esquerda
//    9 Cruzamento Cima e Direita
//    10 Cruzamento Cima e Esquerda
//    11 Cruzamento Baixo e Direita
//    12 Cruzamento Baixo e Esquerda

    protected boolean isCruzamento;
    protected boolean isSpawner;
    protected ArrayList<Cell> nextCell;
    protected int direction; 
    protected Car car;
    protected String image;
    protected int posX;
    protected int posY;

    public Cell(int direction, int posX, int posY) {
        this.direction = direction;
        this.posX = posX;
        this.posY = posY;
        nextCell  = new ArrayList();
        verifyCruzamento();
    }

    public abstract void receiveCar(Car car);

    public abstract void removeCar();

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    private void verifyCruzamento() {
        if (this.direction > 8) {
            this.isCruzamento = true;
        }
    }

     public boolean isIsCruzamento() {
        return isCruzamento;
    }

    public ArrayList<Cell> getNextCell() {
        return nextCell;
    }

    public void setNextCell(ArrayList<Cell> nextCell) {
        this.nextCell = nextCell;
    }
    
    public void addNextCell(Cell newCell){
        this.nextCell.add(newCell);
    }

    public void setIsCruzamento(boolean isCruzamento) {
        this.isCruzamento = isCruzamento;
    }

    public boolean isIsSpawner() {
        return isSpawner;
    }

    public void setIsSpawner(boolean isSpawner) {
        this.isSpawner = isSpawner;
    }
}
