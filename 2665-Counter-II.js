/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let initialVal = init
    const increment = () => init += 1; 

    const decrement = () => init -= 1;

    const reset = () => init = initialVal;

    return {
        increment,
        decrement,
        reset
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */