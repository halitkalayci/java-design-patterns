package behavioral.visitor;

public class Computer implements ComputerPart
{
    ComputerPart[] computerParts;

    public Computer()
    {
        computerParts = new ComputerPart[] { new Keyboard(), new Monitor(), new Mouse() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0; i< computerParts.length; i++){
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
