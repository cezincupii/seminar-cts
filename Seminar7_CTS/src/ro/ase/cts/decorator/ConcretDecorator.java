package ro.ase.cts.decorator;

public class ConcretDecorator extends AbstractDecorator{

    public ConcretDecorator(ICard card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(super.getCard().getDetinatorCard()+" plateste contactless.");
    }


}
