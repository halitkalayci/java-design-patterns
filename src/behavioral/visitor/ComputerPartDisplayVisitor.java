package behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer objesi için kodlar çalıştırıldı..");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse objesi için kodlar çalıştırıldı..");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard objesi için kodlar çalıştırıldı..");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitör objesi için kodlar çalıştırıldı..");
    }
}
