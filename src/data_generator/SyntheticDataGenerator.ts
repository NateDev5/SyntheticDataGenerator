export type Interface = {

}

export type Mutator = {
    path: string,
    threshold: number
}

export class SyntheticDataGenerator {
    constructor(private _elements: any[] = []) {

    }

    protected _Generate (file: string | Interface, quantity: number): any {
        for (let i = 0; i < quantity; i++) {
            let _elements = Object.values(file);
        }
        return this._elements;
    }

    protected _GenerateWithMutator (file: string | Interface, mutators: Mutator[], couples: number): any {
        for (let i = 0; i < couples; i++) {
            let _elements = Object.values(file);
        }
        return this._elements;
    }

    private _export () {

    }
}