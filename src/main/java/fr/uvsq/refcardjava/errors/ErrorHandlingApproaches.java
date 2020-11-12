package fr.uvsq.refcardjava.errors;

import java.util.Optional;

import static java.lang.Math.sqrt;

public class ErrorHandlingApproaches {
    // tag::retcode[]
    public static double sqrtWithReturnCode(double d) {
        return Double.isNaN(d) || d < 0.0 ?
                Double.NaN : //<1>
                sqrt(d);
    }
    // end::retcode[]

    // tag::globalcode[]
    public enum SqrtError { None, NegArg, NaNArg }

    private static SqrtError sqrtError = SqrtError.None;

    public static SqrtError getSqrtError() { return sqrtError; }

    public static double sqrtWithGlobalCode(double d) {
        if (Double.isNaN(d)) { //<1>
            sqrtError = SqrtError.NaNArg;
        } else if (d < 0) { //<1>
            sqrtError = SqrtError.NegArg;
        }
        return sqrt(d);
    }
    // end::globalcode[]

    // tag::exception[]
    public static double sqrtWithException(double d) {
        if (Double.isNaN(d) || d < 0.0) { //<1>
            throw new IllegalArgumentException("Argument négatif ou NaN");
        }
        return sqrt(d);
    }
    // end::exception[]

    // tag::option[]
    public static Optional<Double> sqrtWithOption(double d) {
        return Double.isNaN(d) || d < 0.0 ?
                Optional.empty() :  //<1>
                Optional.of(sqrt(d));
    }
    // end::option[]

    public static void main(String[] args) {
        double value = 4.0;

        {
            // tag::retcodeuse[]
            double result = sqrtWithReturnCode(value);
            if (Double.isNaN(result)) { //<1>
                System.err.println("Argument illégal (négatif ou égal à NaN).");
            } else {
                System.out.printf("sqrt(%f) = %f\n", value, result);
            }
            // end::retcodeuse[]
        }

        {
            // tag::globalcodeuse[]
            double result = sqrtWithGlobalCode(value);
            if (getSqrtError() != SqrtError.None) { //<1>
                System.err.println("Argument illégal (négatif ou égal à NaN).");
            } else {
                System.out.printf("sqrt(%f) = %f\n", value, result);
            }
            // end::globalcodeuse[]
        }

        {
            // tag::exceptionuse[]
            double result;
            try { //<1>
                result = sqrtWithException(value);
                System.out.printf("sqrt(%f) = %f\n", value, result);
            } catch (IllegalArgumentException ex) { //<1>
                ex.printStackTrace(System.err);
            }
            // end::exceptionuse[]
        }

        {
            // tag::optionuse[]
            Optional<Double> result = sqrtWithOption(value); //<1>
            System.out.printf("sqrt(%f) = %f\n", value, result.orElse(Double.NaN));
            // end::optionuse[]
        }
    }
}
