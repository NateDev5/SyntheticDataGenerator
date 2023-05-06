export type Interface = {

}

export type Mutator = {
    path: string
}

export interface WeightedMutator extends Mutator {
    threshold: number,
    enum: any
}

export interface RangeMutator extends Mutator {
    min?: number,
    max?: number,
    getFromParents: boolean
}

export class SyntheticDataGenerator {
    constructor(protected _elements: any[] = [],
        protected _generated_elements: any[] = []) {

    }

    /**
     * @param file string | Interface
     * @param quantity number
     * @returns 
     */
    protected _Generate (file: string | Interface, quantity: number): any {
        for (let i = 0; i < quantity; i++) {
            let _elements = Object.values(file);
        }
        return this._elements;
    }

    /**
     * @param file string | Interface
     * @param mutators Mutator[]
     * @param couples number
     * @returns 
     */
    protected _GenerateWithMutator (file: string | Interface, mutators: Mutator[], couples: number): any {
        for (let i = 0; i < couples; i++) {
            let out = {};
            let _elements = Object.values(file);
            for (const el in _elements) {
                out[el] = ""
            }
        }
        return this._elements;
    }

    /**
     * @param _parent1 enum
     * @param _parent2 enum
     * @param _enum enum
     */
    protected _WeightedMutator (_parent1: any, _parent2: any, _enum: any): any {

    }

    private _export () {

    }
}