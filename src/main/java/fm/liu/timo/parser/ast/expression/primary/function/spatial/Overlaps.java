package fm.liu.timo.parser.ast.expression.primary.function.spatial;

import java.util.List;

import fm.liu.timo.parser.ast.expression.Expression;
import fm.liu.timo.parser.ast.expression.primary.function.FunctionExpression;
import fm.liu.timo.parser.visitor.Visitor;

public class Overlaps extends FunctionExpression {

	public Overlaps(List<Expression> arguments) {
		super("OVERLAPS", arguments);
	}

	@Override
	public FunctionExpression constructFunction(List<Expression> arguments) {
		return new Overlaps(arguments);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
