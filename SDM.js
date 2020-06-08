let listaS = [4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9];
let listaF = [8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12];

console.log(Guloso(listaS, listaF, 11).toString())


function Guloso (ls, lf, n) {
    const { s, f } = sort(ls, lf);
    let x = [];
    let i = 0;
    for( let k = 1; k < n; k++ ) {
        if( s[k] >= f[i] ) {
            x.push(1);
            i = k
        } else {
            x.push(0);
        }
    }
    return x;
}

function sort(s, f) {
    let flag;
    do {
        flag = false;
        for (var i=0; i < s.length - 1; i++) {
            if (f[i] > f[i+1]) {
                f[i] = f[i] ^ f[i+1];
                f[i+1] = f[i+1] ^ f[i];
                f[i] = f[i] ^ f[i+1];
    
                s[i] = s[i] ^ s[i+1];
                s[i+1] = s[i+1] ^ s[i];
                s[i] = s[i] ^ s[i+1];

                flag = true;
            }
        }
    } while (flag);
    return {s, f}
}
