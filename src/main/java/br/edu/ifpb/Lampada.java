package br.edu.ifpb;

public class Lampada {
    private int status = 0;

    public void ligar(){
        status = 1;
    }
    public void desligar(){
        status = 0;
    }
}

abstract class State{
    abstract void execute();
}

class Ligado extends State{

    @Override
    void execute() {

    }
}
class DesLigado extends State{

    @Override
    void execute() {

    }
}
