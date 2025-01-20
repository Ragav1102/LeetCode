
function cancellable(fn, args, t) {
    let timeoutId;
    timeoutId = setTimeout(() => {
        fn(...args);
    }, t);

    return () => {
        clearTimeout(timeoutId);
    };
}
