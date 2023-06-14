package rotations

/**
 * A basic interface for implementing rotation commands.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
interface Rotation {
    fun getName (): String

    fun getDescription (): String

    fun execute ()
}