/*
 * Encog(tm) Core v3.3 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core

 * Copyright 2008-2014 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package za.redbridge.morphevo;

import java.io.Serializable;
import java.lang.StackTraceElement;

import org.encog.ml.MLEncodable;
import org.encog.ml.MLMethod;
import org.encog.ml.genetic.GeneticError;
import org.encog.ml.ea.codec.GeneticCODEC;
import org.encog.ml.ea.genome.Genome;
import org.encog.ml.genetic.genome.DoubleArrayGenome;

/**
 * A CODEC for IMLEncodable classes.
 */
public class MorphCODEC implements GeneticCODEC, Serializable {

    /**
     * The serial id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * {@inheritDoc}
     */
    @Override
    public MLMethod decode(final Genome genome) {
        final MorphGenome morphGenome = (MorphGenome) genome;
        morphGenome.decode();
        return morphGenome.getChrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Genome encode(final MLMethod phenotype) {
        /*final MLEncodable phenotype2 = (MLEncodable) phenotype;
        return new MorphGenome(phenotype2);*/
        throw new GeneticError("Encoding of a my method is not supported.");
    }

}
