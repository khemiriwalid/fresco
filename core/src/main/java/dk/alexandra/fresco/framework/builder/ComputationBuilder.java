package dk.alexandra.fresco.framework.builder;

import dk.alexandra.fresco.framework.Computation;
import dk.alexandra.fresco.framework.builder.ProtocolBuilderNumeric.SequentialNumericBuilder;

public interface ComputationBuilder<OutputT> {

  /**
   * Applies this function to the given argument.
   *
   * @param builder the function argument
   * @return the function result
   */
  Computation<OutputT> build(SequentialNumericBuilder builder);

}