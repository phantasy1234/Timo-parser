/*
 * Copyright 1999-2012 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * (created at 2011-1-23)
 */
package fm.liu.timo.parser.ast.expression.primary.function.groupby;

import java.util.List;

import fm.liu.timo.parser.ast.expression.Expression;
import fm.liu.timo.parser.ast.expression.primary.function.FunctionExpression;
import fm.liu.timo.parser.visitor.Visitor;

/**
 * @author <a href="mailto:shuo.qius@alibaba-inc.com">QIU Shuo</a>
 */
public class Max extends FunctionExpression {
	private final boolean distinct;

	public Max(Expression expr, boolean distinct) {
		super("MAX", wrapList(expr));
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	@Override
	public FunctionExpression constructFunction(List<Expression> arguments) {
		throw new UnsupportedOperationException(
				"function of char has special arguments");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
