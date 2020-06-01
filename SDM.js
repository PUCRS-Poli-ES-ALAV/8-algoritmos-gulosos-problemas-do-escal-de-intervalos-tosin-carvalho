    let listaS = [4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9];
    let listaF = [8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12];

    console.log(Guloso(listaS, listaF, 11));

    function Guloso (s, f, n) {
        f[0] = 0;
        let x = [];
        let i = 0;
        for(let k = 1; k < n; k++) {
            if(s[k] > f[i]) {
                x.push(f[k])
                i = k
            }
        }
        return x;
    }