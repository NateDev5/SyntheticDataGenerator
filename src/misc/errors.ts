export class MissingParameterError extends Error {
    constructor(message: string) {
      super(message);
      this.name = "MissingParameterError";
      Object.setPrototypeOf(this, MissingParameterError.prototype);
    }
  }
  